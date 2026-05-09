import time
file_out = open(r"C:\Users\clara\OneDrive\Dokument\LTH\Utvärdering_av_programvarusystem\uaps-project\python_fib_times.txt","+a")


def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib(n-1) + fib(n-2)

n = 45

for i in range(1000):
    t1 = time.perf_counter_ns()
    fib(n)
    t2 = time.perf_counter_ns()
    delta = t2-t1
    file_out.write(str(n) + "," + str(delta)+ "\n")
    print(i)
    