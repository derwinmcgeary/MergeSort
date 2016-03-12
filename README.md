# MergeSort

This is a quick implementation of MergeSort which works with arrays of integers.
There is a branch where it is implemented using threads, but I strongly
suspect that it isn't actually working with maximal efficiency. I have also made a branch which only uses 4 threads which maxes out my CPUs but for some reason isn't as fast as the recursive one.

## Sample output

`
Array size 1000000 Took : 408 ms
Array size 2000000 Took : 1528 ms
Array size 3000000 Took : 2912 ms
Array size 4000000 Took : 4016 ms
Array size 5000000 Took : 5460 ms
Array size 6000000 Took : 6948 ms
Array size 7000000 Took : 8943 ms
Array size 8000000 Took : 10964 ms
Array size 9000000 Took : 13262 ms
Array size 10000000 Took : 15878 ms
Array size 11000000 Took : 19037 ms
Array size 12000000 Took : 22195 ms
Array size 13000000 Took : 25591 ms
Array size 14000000 Took : 29266 ms
Array size 15000000 Took : 33434 ms
Array size 16000000 Took : 37675 ms
Array size 17000000 Took : 42482 ms
Array size 18000000 Took : 47332 ms
Array size 19000000 Took : 52705 ms

`