from ShapeHexPrism import HexPrism

inp = input().split()
height = float(inp[0])
edges = (float(inp[x]) for x in range(1,len(inp)))
h = HexPrism(height,*edges)
h.printResults()
