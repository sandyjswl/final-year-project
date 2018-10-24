import unittest
import md5,sha1,sha2,sha3
import os 

class TestMD5(unittest.TestCase):

	def __init__(self, *args, **kwargs):
		
		super(TestMD5, self).__init__(*args, **kwargs)
		self.dir_path = os.path.dirname(os.path.realpath(__file__))+"/data/"


	def test_get_hashcode_md5(self):
		self.assertEqual(md5.get_hashcode_md5(self.dir_path+"sample.exe").upper(),"480F2ADA894D30718716258D88D5B3B3")
		self.assertEqual(md5.get_hashcode_md5(self.dir_path+"sample.pdf").upper(),"D2402545649A6B78ABF184A29653F15C")
		self.assertEqual(md5.get_hashcode_md5(self.dir_path+"sample.png").upper(),"4C93EA9951A6228B9B201E99097681C5")
		self.assertEqual(md5.get_hashcode_md5(self.dir_path+"sample.txt").upper(),"3A48074CB2C90F9B6459A948E9473120")

	def test_get_hashcode_sha1(self):
		self.assertEqual(sha1.get_hashcode_sha1(self.dir_path+"sample.exe").upper(),"8043F3BDFAA938838D5E7FCF780E99B354F2B2F2")
		self.assertEqual(sha1.get_hashcode_sha1(self.dir_path+"sample.pdf").upper(),"79C864AA5BB1424EA627B152FFAFF9B5EC3CFC33")
		self.assertEqual(sha1.get_hashcode_sha1(self.dir_path+"sample.png").upper(),"2D48D08C41C09C2BE0E7DDC0E7FAF73BE42E7794")
		self.assertEqual(sha1.get_hashcode_sha1(self.dir_path+"sample.txt").upper(),"995FB9C17343C78FED68E6F0744440313BCFB517")
		

	def test_get_hashcode_sha2(self):
		self.assertEqual(sha2.get_hashcode_sha2(self.dir_path+"sample.exe").upper(),"4E82F93445DBE30051CE7AD5DE009D9F2469BA1E5DBA9DC81A969EB79CA3E537")
		self.assertEqual(sha2.get_hashcode_sha2(self.dir_path+"sample.pdf").upper(),"0541432743A0EBEE55AE345B00DA644A77A9FC9245F8C689E7EC3383F3E4F333")
		self.assertEqual(sha2.get_hashcode_sha2(self.dir_path+"sample.png").upper(),"A8C4E952B93E8309F75EDE67CE50528C6B109EA6192BE112EA6EBFD01962BB3E")
		self.assertEqual(sha2.get_hashcode_sha2(self.dir_path+"sample.txt").upper(),"47A11432796D7DBA332B3917B408601C5A2069BA45901A7D759BB31D316567AF")
			
	def test_get_hashcode_sha3(self):
		self.assertEqual(sha3.get_hashcode_sha3(self.dir_path+"sample.exe").upper(),"1353EAFE82DA966E0C0D9A66240BD8BB59FACBDD257024B96D2FF44FFD3B159C073A8530A315306CE27EBBE0CA6F84299E607CF9EFC95B6251C289BB1BC4811A")
		self.assertEqual(sha3.get_hashcode_sha3(self.dir_path+"sample.pdf").upper(),"DFE6D6CFCA3D6D9E41A39EC592DB4FA15EA1BD67E6A10AB1B745EB90DDC9AA5A0A445E76EAFBD17701F134355CC90A44349118DBDDC16F8DEBF610E0AB1FE787")
		self.assertEqual(sha3.get_hashcode_sha3(self.dir_path+"sample.png").upper(),"CB3653A26CF348D5C736CCC6734736E90EEEDEA21B3B3F13DA06A22A63DFB6408C8FCC4C662671D4635FE503F9BB88FA65C4B0B2D847BB6352331B441A15A445")
		self.assertEqual(sha3.get_hashcode_sha3(self.dir_path+"sample.txt").upper(),"EB528A4039BC2B639405CC88D7D4D5B9823D2DE4BC0E0F9E86DA458B0E93C48A8A4CE49222A6961ED1E75AC76437C02E8DEF26DB4CE0584318990012CC990B95")
					

if __name__ == '__main__':
	unittest.main()