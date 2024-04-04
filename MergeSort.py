"""
    Implementacion del algoritmo de ordenación MergeSort
"""

def mergeSort(arr):

    # Un arreglo de longitud 1 (len(arr) == 1) es un arreglo que siempre está ordenado
	if len(arr) > 1:

		# Encontrando la mitad del arreglo
		mitad = len(arr)//2

		# Dividing the array elements
		izquierda = arr[:mitad]

		# Into 2 halves
		derecha = arr[mitad:]

		# Ordenando la primera mitad (algoritmo recursivo)
		mergeSort(izquierda)

		# Ordenando la segunda mitad (algoritmo recursivo)
		mergeSort(derecha)

		i = j = k = 0

		# Copiando los datos en arreglos temporales izquierda[] y derecha[]
		while i < len(izquierda) and j < len(derecha):
			if izquierda[i] <= derecha[j]:
				arr[k] = izquierda[i]
				i += 1
			else:
				arr[k] = derecha[j]
				j += 1
			k += 1

		# Comprobando si algun elemento fue olvidado
		while i < len(izquierda):
			arr[k] = izquierda[i]
			i += 1
			k += 1

		while j < len(derecha):
			arr[k] = derecha[j]
			j += 1
			k += 1


# Imprimir un arreglo dado
def printList(arr):
	for i in range(len(arr)):
		print(arr[i], end=" ")
	print()


# Codigo principal
if __name__ == '__main__':
	arr = [1, 50, 60, 3, 5, 7, 76, 40, 23, 25]
	print("--- El arreglo ingresado es ---")
	printList(arr)
	mergeSort(arr)
	print("\n--- El arreglo ordenado es ---")
	printList(arr)