class Node:
    def __init__(self, d):
        self.data = d
        self.left = None
        self.right = None

def sortedArrayToBST(arr):
    if not arr:
        return None

    # find middle
    mid = (len(arr)) / 2
    mid =int(mid)

    # make the middle element the root
    root = Node(arr[mid])

    # left subtree of root has all
    # values <arr[mid]
    root.left = sortedArrayToBST(arr[:mid])

    # right subtree of root has all
    # values >arr[mid]
    root.right = sortedArrayToBST(arr[mid + 1:])
    return root

def preOrder(node):
    if not node:
        return

    print(node.data)
    preOrder(node.left)
    preOrder(node.right)

def secventa(node, c):
    if node.data==c:
        return []
    elif c<node.data:
        temp = secventa(node.left,c)
        temp.append(0)
        return temp
    else:
        temp = secventa(node.right, c)
        temp.append(1)
        return temp



if __name__=="__main__":
    arr = ["a", "b", "c", "d", "e", "f"]#, "g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
    root = sortedArrayToBST(arr)
    #preOrder(root)
    sec = [ "d", "b", "a", "c", "f", "e", "a", "a", "e"]
    listamare = []
    for e in sec:
        lista = secventa(root, e)
        lista.append(1)
        lista.reverse()
        listamare = listamare+lista
    print(listamare)
