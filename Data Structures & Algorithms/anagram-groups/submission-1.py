from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        main_dict = defaultdict(list)
        for string in strs:
            c = [0] * 26
            for i in string:
                c[ord(i) - ord('a')] += 1
            main_dict[tuple(c)].append(string)
        return main_dict.values()

                
        
        