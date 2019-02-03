area = ames$Gr.Liv.Area
price = ames$SalePrice
summary(area)
hist(area)
qqnorm(area)
qqline(area)
set.seed(234567899)
samp1 = sample(area, 50)
summary(samp1)
hist(samp1)
mean(samp1)
qqnorm(samp1)
qqline(samp1)

samp2 = sample(area, 50)
mean(samp2)
samp3 = sample(area, 100)
mean(samp3)
samp4 = sample(area, 1000)
mean(samp4)

sample_means50 = rep(0, 5000)
for (i in 1:5000) {
  samp = sample(area, 50)
  sample_means50[i] = mean(samp)
}
hist(sample_means50, breaks = 25)

sample_means_small = rep(0, 100)
for (i in 1:100) {
  samp = sample(area, 50)
  sample_means_small[i] = mean(samp)
}

sample_means10 = rep(0, 5000)
sample_means100 = rep(0, 5000)
for (i  in 1:5000) {
  samp = sample(area, 10)
  sample_means10[i] = mean(samp)
  samp = sample(area, 100)
  sample_means100[i] = mean(samp)
}
par(mfrow = c(3,1))

xlimits = range(sample_means10)
hist(sample_means10, breaks = 20, xlim = xlimits)
hist(sample_means50, breaks = 20, xlim = xlimits)
hist(sample_means100, breaks = 20, xlim = xlimits)
par(mfrow = c(1,1))

area = ames$Gr.Liv.Area
price = ames$SalePrice
summary(price)
hist(price)
qqnorm(price)
qqline(price)
set.seed(234567999)

samp = sample(price, 50)
mean(samp)
sample_means50 = rep(0, 5000)
for (i in 1:5000) {
  samp = sample(price, 50)
  sample_means50[i] = mean(samp)
}
hist(sample_means50, breaks = 25)

mean(sample_means50)
par(mfrow = c(1,1))
hist(sample_means50, breaks = 25)

samp1 = sample(price, 150)
mean(samp1)
sample_means150 = rep(0, 5000)
for (i in 1:5000) {
  samp = sample(price, 50)
  sample_means150[i] = mean(samp)
}
hist(sample_means150, breaks = 25)
mean(sample_means150)


