
const process = require('process')

const limit = 100000000
const startedAt = process.hrtime()

let sum = 0

for (let i = 0; i < limit; i++) {
//// HELP ME, concurrency makes it only worse?
//	process.nextTick(() => {
  sum += Math.random()
//	})
}

process.on('exit', () => {
  const elapsed = process.hrtime(startedAt)
  console.log('Elapsed: %d sec', elapsed[0] + (elapsed[1] / 1e9))
  console.log('Result', sum)
})