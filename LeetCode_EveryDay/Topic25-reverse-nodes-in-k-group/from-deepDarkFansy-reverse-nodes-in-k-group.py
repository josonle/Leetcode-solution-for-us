class Solution:
    def reverseKGroup(self, head: ListNode, k: int) -> ListNode:
        if not head:
            return None
		# 用con储存每一个节点， con1来储存有K个节点的链表
        con = []
        con1 = []
        while head:
            con.append(head)
            head = head.next
        for i in range(0,len(con),k):
            if i <= len(con)-k:				#判断是否有K个节点，即是否需要倒置。
                for j in range(k-1):
                    con[i+k-j-1].next = con[i+k-j-2]
                con[i].next = None
                con1.append([con[i+k-1],con[i]])
            else:
                con1.append([con[i], con[len(con)-1]])
        for i in range(len(con1)-1):
            con1[i][1].next = con1[i+1][0]
        return con1[0][0]