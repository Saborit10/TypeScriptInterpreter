import os, sys

EXTENSION = '.java'

folder_name = sys.argv[1]
package_name = sys.argv[2]

line = 'package ' + package_name + ';'

def add_package(filename):
	global line
	f = open(filename, 'r')
	
	lines = f.readlines()

	new_lines = [line, '\n']
	for i in lines:
		new_lines.append(i)

	f.close()

	f = open(filename, 'w')

	for i in new_lines:
		f.write(i)
	f.close()

if __name__ == '__main__':
	for f in os.listdir(folder_name):
		if f.endswith(EXTENSION):
			add_package(os.path.join(folder_name, f))