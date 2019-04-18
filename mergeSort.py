class msort():
	def merge(self, left, right):
		'''Merge 2 sorted lists into a sorted list'''
		result = []
		l = len(left)
		r = len(right)
		i = j = 0
		while(i<l and j<r):
			if(left[i]<right[j]):
				result.append(left[i])
				i+=1
			else:
				result.append(right[j])
				j+=1
		for i in range(i,l):
			result.append(left[i])
		for j in range(j,r):
			result.append(right[j])
		return result

	def mergeSort(self, arr):
		'''Recursively sort the array'''
		n = len(arr)
		if(n<=1):
			return arr
		left = arr[:int(n/2)]
		right = arr[int(n/2):]
		left = self.mergeSort(left)
		right = self.mergeSort(right)
		result = self.merge(left, right)
		return result

if __name__ == '__main__':
	o = msort()
	assert o.mergeSort([]) == []
	assert o.mergeSort([1]) == [1]
	assert o.mergeSort([1,2,3,4,5,6]) == [1,2,3,4,5,6]
	assert o.mergeSort([1,2,3,4,5,6,7]) == [1,2,3,4,5,6,7]
	assert o.mergeSort([6,5,4,3,2,1]) == [1,2,3,4,5,6]
	assert o.mergeSort([7,6,5,4,3,2,1]) == [1,2,3,4,5,6,7]
	print("Success")
