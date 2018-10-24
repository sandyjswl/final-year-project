import hashlib
import os
import time
import datetime

def get_hashcode_sha2(filename):
    #print(filename)
    BUF_SIZE = 65536  # lets read stuff in 64kb chunks!
    sha2 = hashlib.sha256()   
    with open(filename, 'rb') as f:
        while True:
            data = f.read(BUF_SIZE)
            if not data:
                break
            sha2.update(data)
    return sha2.hexdigest() 

def display_result(filename,hashcode,time_taken):
    print("File Name: "+filename)
    print("HashCode Generated by SHA-256 : {0}".format(hashcode))
    print("Time Taken: "+str(time_taken.total_seconds() * 1000)+" ms")
    print()

def load_files():
    directory_in_str = os.path.dirname(os.path.realpath(__file__))
    directory_in_str = directory_in_str+"/data"
    directory = os.fsencode(directory_in_str)
    for file in os.listdir(directory):
        filename = os.fsdecode(file)
        filename = directory_in_str+"/"+filename
        start_time =datetime.datetime.now()
        hashcode = get_hashcode_sha2(filename)
        end_time = datetime.datetime.now()
        time_taken = end_time - start_time 
        display_result(filename,hashcode,time_taken)

def main():
    load_files()

if __name__ == '__main__':
    main()