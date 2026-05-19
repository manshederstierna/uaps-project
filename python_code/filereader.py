import time

file_path = r"sample_text.txt"
file_out = open(r"python_fileread_times.txt","+a")

def read_file():
    with open(file_path) as f:
        for line in f:
            pass


for i in range(5000):
    t1 = time.perf_counter_ns()
    read_file()
    t2 = time.perf_counter_ns()
    delta = t2 - t1
    file_out.write(str(i) + "," + str(delta) + "\n")