class solution:
    def reverseWords(self, s):
        s = s.strip(".")
        a = [w for w in s.split(".") if w]
        a = a[::-1]
        return ".".join(a)