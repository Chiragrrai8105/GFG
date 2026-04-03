class Solution:
	def mergeOverlap(self, arr):
		arr.sort(key=lambda i:i[0])
		output=[arr[0]]
		for start,end in arr[1:]:
		    lastend=output[-1][1]
		    if start<=lastend:
		        output[-1][1]=max(lastend,end)
		    else:
		        output.append([start,end])
		return output        
		