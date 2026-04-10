from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        main_dict = defaultdict(list)
        for string in strs:
            make_key = ''.join(sorted(string))
            main_dict[make_key].append(string)

        return main_dict.values()

                
        
        