load("bdims.RData")
head(bdims)
mdims = subset(bdims, bdims$sex == 1)
fdims = subset(bdims, bdims$sex == 0)
fdims$hgt
mdims$hgt
hist(fdims$hgt)
hist(mdims$hgt)
fhgtmean = mean(fdims$hgt)
fhgtsd = sd(fdims$hgt)
hist(fdims$hgt, probability = TRUE , ylim = c(0, 0.06))
x = 140:190
y = dnorm(x = x, mean = fhgtmean, sd = fhgtsd)
lines(x = x, y = y, col = "blue")
qqnorm(fdims$hgt)
qqline(fdims$hgt)
sim = rnorm(n = length(fdims$hgt), mean = fhgtmean, sd = fhgtsd)
hist(sim)
qqnorm(sim)
qqline(sim)

qqnormsim(fdims$hgt)
fdims$wgt
hist(fdims$wgt)
fwgtmean = mean(fdims$wgt)
fwgtsd = sd(fdims$wgt)
hist(fdims$wgt, probability = TRUE , ylim = c(0, 0.06))
x = 140:190
y = dnorm(x = x, mean = fwgtmean, sd = fwgtsd)
lines(x = x, y = y, col = "blue")
qqnorm(fdims$wgt)
qqline(fdims$wgt)
sim = rnorm(n = length(fdims$wgt), mean = fwgtmean, sd = fwgtsd)
hist(sim)
qqnorm(sim)
qqline(sim)

qqnormsim(fdims$wgt)
1 - pnorm(q = 182, mean = fhgtmean, sd = fhgtsd)
sum(fdims$hgt > 182)/length(fdims$hgt)

head(bdims)
fdims = subset(bdims, bdims$sex == 0)
fdims$bii.di
hist(fdims$bii.di)
fbii.dimean = mean(fdims$bii.di)
fbii.disd = sd(fdims$bii.di)
hist(fdims$bii.di, probability = TRUE , ylim = c(0, 0.20))
x = 20:50
y = dnorm(x = x, mean = fbii.dimean, sd = fbii.disd)
lines(x = x, y = y, col = "blue")
qqnorm(fdims$bii.di)
qqline(fdims$bii.di)

head(bdims)
1 - pnorm(q = 182, mean = fhgtmean, sd = fhgtsd)
sum(fdims$hgt > 182)/length(fdims$hgt)

head(bdims)
fdims = subset(bdims, bdims$sex == 0)
fdims$elb.di
hist(fdims$elb.di)
felb.dimean = mean(fdims$elb.di)
felb.disd = sd(fdims$elb.di)
hist(fdims$elb.di, probability = TRUE , ylim = c(0, 0.50))
x = 5:15
y = dnorm(x = x, mean = felb.dimean, sd = felb.disd)
lines(x = x, y = y, col = "blue")
qqnorm(fdims$elb.di)
qqline(fdims$elb.di)

head(bdims)
fdims = subset(bdims, bdims$sex == 0)
fdims$age
hist(fdims$age)
fagemean = mean(fdims$age)
fagesd = sd(fdims$age)
hist(fdims$age, probability = TRUE , ylim = c(0, 0.07))
x = 10:70
y = dnorm(x = x, mean = fagemean, sd = fagesd)
lines(x = x, y = y, col = "red")
qqnorm(fdims$age)
qqline(fdims$age)

head(bdims)
fdims = subset(bdims, bdims$sex == 0)
fdims$che.de
hist(fdims$che.de)
fche.demean = mean(fdims$che.de)
fche.desd = sd(fdims$che.de)
fche.desd = sd(fdims$che.de)
hist(fdims$che.de, probability = TRUE , ylim = c(0, 0.25))
x = 14:26
y = dnorm(x = x, mean = fche.demean, sd = fche.desd)
lines(x = x, y = y, col = "green")
qqnorm(fdims$che.de)
qqline(fdims$che.de)

head(bdims)
fdims = subset(bdims, bdims$sex == 0)
fdims$bii.di
hist(fdims$bii.di)
fbii.dimean = mean(fdims$bii.di)
fbii.disd = sd(fdims$bii.di)
hist(fdims$bii.di, probability = TRUE , ylim = c(0, 0.20))
x = 15:40
y = dnorm(x = x, mean = fbii.dimean, sd = fbii.disd)
lines(x = x, y = y, col = "blue")
qqnorm(fdims$bii.di)
qqline(fdims$bii.di)

head(bdims)
fdims = subset(bdims, bdims$sex == 0)
fdims$kne.di
hist(fdims$kne.di)
fkne.dimean = mean(fdims$kne.di)
fkne.disd = sd(fdims$kne.di)
hist(fdims$kne.di, probability = TRUE , ylim = c(0, 0.35))
x = 15:25
y = dnorm(x = x, mean = fkne.dimean, sd = fkne.disd)
lines(x = x, y = y, col = "orange")
qqnorm(fdims$kne.di)
qqline(fdims$kne.di)

sim = rnorm(n = length(fdims$kne.di), mean = fkne.dimean, sd = fkne.disd)
hist(sim)
qqnorm(sim)
qqline(sim)
qqnormsim(fdims$kne.di)
