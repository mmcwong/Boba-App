var express = require('express');
var redis = require('redis');
var crypto = require('crypto');
var bodyParser = require('body-parser')

// Redis
var redis_client = redis.createClient();
redis_client.on('error', function(err){
  console.log("REDIS ERROR: " + err);
});

var app = express();

var api_url_base = "/api"
app.use(bodyParser.json());

var api_url_base = "/api/boba_app";

function hash(x) {
  var shasum = crypto.createHash('sha1');
  var user_hash = shasum.update(String(x));
  return user_hash.digest('hex');

}

app.route(api_url_base + '/user').post(function (req, res) {

  var email = req.body.email || res.send({msg: "Please provide a email in the request body"});
  var name = req.body.name || res.send({msg: "Please provide a name in the request body."});

  var user_key = "users:" + hash(email);

  // Store to redis
  redis_client.hmset(user_key , "email", email, "name", name, function(err, replies) {
      if(err) {
        console.log("Could not add user with name, email: " + name + " " + email + " because: " + err);
        res.send({
          msg: "Could not add user"
        });
      } else {
        res.send({
          msg: "Bill approves."
        });
      }
  });
});

app.route(api_url_base + '/user/:email').get(function (req, res) {
  // Get the username
  var email = req.params.email || res.send({ msg: "Please send a url param" });

  redis_client.hmget("users:" + hash(email), 'email', 'name', function(err, replies) {
    if(err) {
       console.log("Could get user with email: " + email + " " + err);
        res.send({
          msg: "Could not get user with email: " + email
        });
    } else {
      console.log(replies);
      res.send({
          email: replies[0],
          name: replies[1]
      });
    }
  });
});

app.route(api_url_base + '/run').post(function (req, res) {
  var group_name = req.body.group_name || res.send({ msg: "Please send a group_name param" });

  // store to redis
  res.send({
  	msg: "success"
  });
});

app.route(api_url_base + '/run/:run_name').get(function (req, res) {
  res.send({
  	group_members: [
		"Bill",
	  	"Bill",
	  	"Bill",
		"Bill",
	  	"Bill"],
  	active_runs: ["bill_run","bill_run","bill_run","bill_run",]
  });
});

app.route(api_url_base + '/run/:run_name/user/add').post(function (req, res) {
  var user_email = req.body.user_email;
  // store to redis
  res.send({
  	msg: "success"
  });
});

app.route(api_url_base + '/run/:run_name/user/paid').post(function (req, res) {
  var user_email = req.body.user_email;
  // store to redis
  res.send({
    msg: "success"
  });
});


// Launch server

var server = app.listen(3000, function() {
    console.log('Listening on port %d', server.address().port);
});
