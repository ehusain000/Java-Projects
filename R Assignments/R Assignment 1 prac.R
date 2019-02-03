#flip a fair coin once
rbinom(1,1,.5)

#flip a coin 10 times
rbinom(10,1,.5)

#how many heads in 10 tosses?
rbinom(1,10,.5)

#heads in 10 tosses 10 of coins
rbinom(10,10,.5)

#heads in 10 tosses of 10 unfair coins
#each toss is a head with probability 0.8
rbinom(10,10,.8)
#most common number is 8 because 
#head probabily is most like 8 out of 10 sue to unfair coin toss

#heads in 100 tosses of 10 unfair coins
#each toss is a head with probability 0.3
rbinom(100,10,.3)
#most common number is 3 because
#the coin is unfair with heads most like to be 3 out of 10

#flip a fair coin 10 times
#prob of seeing a head in a toss is 0.5
# prob of seeing 5 heads in 10 toss is 0.5
flips <- rbinom(10,1,.5)
mean(flips == 5)

#repeat the experiment 100,000 times of 10 coin flips, coin is fair
flips <- rbinom(100000,10,.5)

#percentage of seeing 5 heads among 100,000 outcomes
mean(flips == 5)

#flip 10 fair coins, what is the probability of seeing 5 heads ?
dbinom(5,10,.5)

#flip 10 fair coins, what is the probability of seeing 6 heads ?
dbinom(6,10,.5)
#flip 10 fair coins, what is the probability of seeing 5 heads ?
dbinom(7,10,.5)

#flip 10 unfair coins, what is the probability of seeing 2 heads?
# 30% prob. of head, 3 out 10 outcomes likely to be head
dbinom(2,10,0.3)

#repeat the experiment 10,000 times of 10 coinf flips, unfair coins
flips <- rbinom(10000,10,0.3)
#what is the probability of seeing 2 heads ?
mean(flips == 2)

#repeat the experiment 100,000,000 times of 10 coinf flips, unfair coins
flips <- rbinom(100000000,10,0.3)
#what is the probability of seeing 2 heads ?
mean(flips == 2)

#after comparing part a, part b and the exact result,
#my conclusion is that
#the percentage difference between them is very small

#average number of heads
mean(flips <- rbinom(100000,10,.5))

#average number of heads
mean(flips <-rbinom(100000,100,.2))

#average number of heads
#30% chance of heads
mean(flips <-rbinom(100000,25,.3))
#simlation close to 7.5

#var of X var(X)
var(rbinom(100000,10,.5))

#var of X var(X)
var(rbinom(100000,100,.2))

#var of X var(X)
var(rbinom(100000,25,.3))
#result of simulation close to 5