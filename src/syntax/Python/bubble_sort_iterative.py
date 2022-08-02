arr = [15, -7, 12, 2, 9]


class Solution(object):
    def __init__(self, arr):
        self.arr = arr

    def bubble_sort(self, arr):

        temp = 0
        for i in range(len(arr)):
            for j in range(len(arr) - 1):
                if arr[j] > arr[j + 1]:
                    temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp

        return arr


res = Solution(arr)
print(res.bubble_sort(arr))
