/*
nums = [3,6,9,12]
{}
{3=2}
{3=3, 6=2}
{3=4, 6=2, 9=2}
​
No one gave any dry run to this problem.
​
so for every index i we will check all the previous indexes and get their difference
​
for i = 0
it's 0
​
for i = 1
we will iterate i = 0
so we wil get 6 - 3 = 3 and length of diff 3 will be 2 {3,6}
so at tillI at i = 1 => {3=2}
​
for i = 2
we will iterate i = 0, 1
so for i = 0 the different is 6. there so we will put 6 = 2
for i = 1 the difference is 3. and for i = 1 in tillI length of diff 3 is 2 so now we will increment here
so at tillI at i = 2 => {3=3, 6=2}
​
for i = 3
we will iterate i = 0, 1, 2
for i = 2 the difference is 3. and at i = 2 in tillI for diff 3 length is 3 so here it will be 3 + 1= 4.
and we will get tillI at i = 3 => {3=4, 6=2, 9=2}
*/
​