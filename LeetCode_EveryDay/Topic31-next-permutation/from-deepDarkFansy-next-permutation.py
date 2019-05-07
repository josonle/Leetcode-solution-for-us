class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
		#判断元素个数是否为1
        if len(nums) < 2:
            return 
		
		#自定义排序算法，用于对列表的部分数据进行排序（这里用的交换排序）
        def fun(index, nums):
            l = len(nums)
            for i in range(index, l-1):
                for j in range(i+1, l):
                    if nums[j] < nums[i]:
                        nums[i], nums[j] = nums[j], nums[i]
            
        le = len(nums)
        i = le-2
		
		#从倒数第二个元素开始，依次向高位遍历，找到低位可以交换（即比当前位置元素大）的最小元素
		#最后对交换之后的元素的低位数字再进行排序
		#我这里用字典con存储了所有可交换的位置，然后找出最小的
        while i>=0:
            j = i+1
            con = {}
            while j < le:
                if nums[i] < nums[j]:
                    if nums[j] not in con:
                        con[nums[j]] = []
                    con[nums[j]].append(j)
                j += 1
            if con != {}:
                sw = min(list(con.keys()))
                nums[i], nums[con[sw][0]] = nums[con[sw][0]], nums[i]
                fun(i+1, nums)
                return       
            i -= 1
        nums.reverse()