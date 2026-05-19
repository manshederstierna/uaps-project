import time

numbers = []
path_in = r"/home/manshederstierna/gitrepos/uaps-project/data.txt"
path_out = r"/home/manshederstierna/gitrepos/uaps-project/python_sort_times.txt"

def insertionSort():
    for i in range(1, len(numbers)):
        key = numbers[i]
        j = i - 1

        while j >= 0 and numbers[j] > key:
            numbers[j + 1] = numbers[j]
            j -= 1

        numbers[j + 1] = key


file_out = open(path_out, "+a")

for i  in range(5000):
    with open(path_in) as f:
     for line in f:
        numbers.append(int(line)) 
    t1 = time.perf_counter_ns()
    insertionSort()
    t2 = time.perf_counter_ns()
    delta = t2 - t1
    file_out.write(str(i) + "," + str(delta) + "\n")
    numbers = []
    print(i)