import math

class HexPrism:
    def __init__(self, height, *dimension): 
        self.height = height #assign the first input as height
        self.dimension = dimension #assign the rest of the input as dimension

    def printResults(self):
        set_dimension = set(self.dimension) #assign self.dimension as a set to make sure that there are no duplicates
        if (len(set_dimension)) != 1: #checks if the edges has duplicates, if yes it prints the error
            print("“Hex Prism Error!")
        elif (len(self.dimension)) != 6: #checks if the edges that are inputted are not equal to six, if yes it prints the error
            print("“Hex Prism Error!")
        elif (self.height) <= 0 or (self.dimension[0]) <= 0: #checks if the input has any number less than or equal to zero, if yes it prints the error
            print("“Hex Prism Error!")
        elif (len(set_dimension)) == 1: #checks if the input has no duplicates, if yes proceed to do the formula and prints the result
            surface_area = 6 * (self.dimension[0]) * (self.height) + 3 * (math.sqrt(3) * math.pow(self.dimension[0], 2)) #formula of the surface area of the hexagonal prism
            volume = 3 * math.sqrt(3) / 2 * math.pow(self.dimension[0], 2) * (self.height) #formula of the volume of the hexagonal prism
            print("SA: %.1f" % surface_area + " Volume: %.1f" % volume)
        
