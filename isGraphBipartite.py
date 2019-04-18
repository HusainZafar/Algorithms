# https://leetcode.com/problems/is-graph-bipartite/submissions/

class Solution:
    def isBipartite(self, graph) -> bool:
        n = len(graph)
        visited = {}
        color = {} # 1 and -1 are the colors assigned at different levels

        # Iterate over all nodes to account for disconnected components
        for root in range(n):
            # If node has already been colored
            if root in color:
                continue
                
            # BFS over this node as root. Will cover all nodes connected to root
            queue = [root]
            color[root] = 0
            while(len(queue)):
                cur = queue.pop(0)
                visited[cur] = True
                # All neighbors of root
                for node in graph[cur]:
                    if not node in visited:
                        # Color conflict
                        if node in color and color[cur] == color[node]:
                            return False
                        queue.append(node)
                        color[node] = 1 - color[cur]
        return True

if __name__ == '__main__':
	o = Solution()
	assert(o.isBipartite([[1,2,3], [0,2], [0,1,3], [0,2]]) == False)
	print("Success")
