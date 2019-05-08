- Topic28：https://leetcode-cn.com/problems/divide-two-integers/

两数相除，给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。返回被除数 dividend 除以除数 divisor 得到的商

* 被除数和除数均为 32 位有符号整数。除数不为 0
* 只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。本题中，如果除法结果溢出，则返回 2^31 − 1

### Tips

- 两数相异，异或(^)为负
- 不能用除法，改用减法，但减法不是减去1，而是减去2^n以便快速减

因为n是32位，所以n从31开始减1，直到dividend/2^n大于等于divisor，然后被除数变成dividend-2^n*divisor，继续判断能否被divisor除。
比如100/3，先n=5，被除数变成4（100-3*2^5）,2^5是商的一部分。然后继续除，最后商为33