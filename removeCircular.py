# In a circular group of N people, remove 1 until only 1 remains. Remove the kth person each time

def removal(N, k):
    people = list(range(1,N+1))
    base = 0
    res = []
    while(len(people)>1):
        temp = (base+k-1) % N
        base = temp
        res.append(people[temp])
        people.pop(temp)
        N-=1
    return res

if __name__ == '__main__':
    ret = removal(5, 3)
