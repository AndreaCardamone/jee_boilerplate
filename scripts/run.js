const mvn = require('maven').create();

mvn.execute(['jetty:run'], {'skipTests': true}).then(console.log, console.error);
