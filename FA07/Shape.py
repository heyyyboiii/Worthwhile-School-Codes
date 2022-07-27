import math

class Shape:
    def __init__(self, *side):
        self.side = side

    def printArea(self):
        checker = set(self.side)
        if len(checker) == 1:
            if len(self.side) == 1:
                radius = self.side[0] / 2
                cir_area = 3.14159 * math.pow(radius, 2)
                print("%.1f" % cir_area)
            if len(self.side) == 3:
                tri_area = math.sqrt(3)/4 * math.pow(self.side[0], 2)
                print("%.1f" % tri_area)
            elif len(self.side) == 4:
                squ_area = math.pow(self.side[0], 2)
                print("%.1f" % squ_area)
            else:
                print("Shape Area Error!")
        else:
            print("Shape Area Error!")

        
