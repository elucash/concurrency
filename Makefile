.PHONY: runjava runnode
	
RandomSumParallel.class: RandomSumParallel.java
	javac RandomSumParallel.java
	
runjava: RandomSumParallel.class
	java RandomSumParallel
	
runnode: random-sum-helpme.js
	node random-sum-helpme.js