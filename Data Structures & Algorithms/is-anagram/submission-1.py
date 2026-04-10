from collections import defaultdict
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sfreq_map = defaultdict(int)
        tfreq_map = defaultdict(int)
        if len(s) != len(t):
            return False
        for i in s:
            sfreq_map[i] += 1
        for i in t:
            tfreq_map[i] += 1
        for key in sfreq_map.keys():
            if sfreq_map[key] != tfreq_map[key]:
                return False
        return True


