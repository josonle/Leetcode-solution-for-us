 * Topic11：https://leetcode-cn.com/problems/container-with-most-water/

给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。n>=2,且容器不能倾斜
***

josonlee:心得，脱胎于两数之和那道题，也是采取双指针前后遍历
```java
//因为h是取最小的，移动指针是为了找到和当前最高的h接近。比如height[1]=3,height[7]=6,肯定是期望height[4]比height[3]接近height[7]
if(height[i]<height[j])
    i++;
else
    j--;
```