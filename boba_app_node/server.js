var express = require('express');

var app = express();

var api_url_base = "/api"

app.route(api_url_base + '/user').post(function (req, res) {
  var name = req.body.name;
  var email = req.body.email;
  // store to redis
  res.send({
  	msg: "success"
  });
});

app.route(api_url_base + '/user/:email').get(function (req, res) {
  res.send({
  	name: "Bill",
  	email: req.params.email
  });
});

app.route(api_url_base + '/group').post(function (req, res) {
  var group_name = req.body.group_name;
  var password = req.body.password;
  // store to redis
  res.send({
  	msg: "success"
  });
});

app.route(api_url_base + '/group/:group_name').get(function (req, res) {
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

app.route(api_url_base + '/group/:group_name/user').post(function (req, res) {
  var user_email = req.body.user_email;
  // store to redis
  res.send({
  	msg: "success"
  });
});



// Launch server

var server = app.listen(80, function() {
    console.log('Listening on port %d', server.address().port);
});
