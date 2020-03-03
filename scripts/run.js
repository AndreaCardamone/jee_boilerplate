const mvn = require('maven').create({
  profiles: ['dev-server']
});

mvn.execute(['jetty:run']).then(console.log, console.error);
