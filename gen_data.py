import random
file_out = open("data.txt", "w")

for i in range(2500):
    number = random.randint(0,1000000)
    file_out.write(str(number) + "\n")

file_out.close()


