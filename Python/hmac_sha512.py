import hashlib
import os
import time
import datetime
import hmac
import sys

def get_hashcode_hmac(filename,key):
    # print(filename)
    BUF_SIZE = 65536  # lets read stuff in 64kb chunks!
    byte_array=bytearray()
    byte_array.extend(map(ord,key))
    digest_maker = hmac.new(byte_array, ''.encode('utf-8'), hashlib.sha512)
    with open(filename, 'rb') as f:
        while True:
            data = f.read(BUF_SIZE)
            if not data:
                break
            digest_maker.update(data)
    return digest_maker.hexdigest().upper()


def display_result(filename, hashcode, time_taken):
    print("File Name: " + filename)
    print("HashCode Generated by HMAC : {0}".format(hashcode))
    print("Time Taken: " + str(time_taken.total_seconds() * 1000) + " ms")
    print()


def load_files(key):
    directory_in_str = os.path.dirname(os.path.realpath(__file__))
    directory_in_str = directory_in_str + "/data"
    directory = os.fsencode(directory_in_str)
    for file in os.listdir(directory):
        filename = os.fsdecode(file)
        filename = directory_in_str + "/" + filename
        start_time = datetime.datetime.now()
        hashcode = get_hashcode_hmac(filename,key)
        end_time = datetime.datetime.now()
        time_taken = end_time - start_time
        display_result(filename, hashcode, time_taken)


def main():
    key = sys.argv[1]
    load_files(key)


if __name__ == '__main__':
    main()