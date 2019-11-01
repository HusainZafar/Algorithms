# Sort matrix elements and insert it into a matrix diagonally in bottom to top manner

def sort_asc(M, n):
    elements = []
    for row in M:
        for el in row:
            elements.append(el)
    c = Counter(elements).most_common()
    ordered = []
    for i,j in c:
        ordered += [i]*j
    k = 0
    count = 0
    ref = n-1
    loop = 1
    for diff in range(n-1, -n, -1):
        i = ref
        for j in range(loop):
            j = i - diff
            M[i][j] = ordered[k]
            k += 1
            i -= 1

        count += 1
        if count >= n:
            loop -= 1
            ref = loop-1
        else:
            loop += 1
    return M

if __name__ == '__main__':
    M = [[1, 2, 3],
         [4, 5, 3],
         [7, 2, 5]]
    print(sort_asc(M, len(M)))
