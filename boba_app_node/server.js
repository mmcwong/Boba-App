var express = require('express');

var app = express();

app.get('/api', function (req, res) {
  res.send('it works~');
});

// Launch server

var server = app.listen(3000, function() {
    console.log('Listening on port %d', server.address().port);
});
