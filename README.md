#Leetcode-In-Java

本人大三学渣一枚，马上就要毕业找工作了。听说刷leetcode对找工作面试（zhuangbi）很有帮助，现准备利用剩下的几个月时间抱抱佛脚。
代码并不全是本人写的，有的参考了网络上其他前辈的想法，但都能在OJ上AC。

现记录下学习的过程，一来方便以后复习，二来也希望对以后找工作的童鞋有所帮助。

###先写索引吧


1 . Two-Sum
<pre><code>
	要点：	
		- 利用java中Array对象的sort方法排序，使得整个数组呈升序状态
		- 再利用两段取点相加的sum与target比较
			-  若大于target，则后结点前移，sum变小
			-  若小于target，则前结点后移，sum变大
		逐个试，向中间逼近，直到找出符合条件的两个数

</code></pre>
	
2 . Reverse-Linked-List-II
<pre><code>
	要点：	
		- 确定边界条件，定位到起点
		- 再利用头插法对指定段的链表逆序
		链表逆序之头插法，关键代码（牢记）：
		pre.next = cur.next;
        	cur.next = head.next;
        	head.next = cur;
        	cur = pre.next;
</code></pre>

3 . Add-TwoNum
<pre><code>
	要点：	
		- 分别考虑相加的两个链表长度相同和不同的情况
		- 代码块的复用，避免冗长
</code></pre>

4 . Zigzag-Conversion
<pre><code>
要点：
<h3><pre><code>
图解		0      6			0       8
		↓    ↑ ↓			↓     ↑ ↓
		1   5  7			1    7  9
		↓   ↑  ↓			↓    ↑  ↓
		2  4   8			2   6  10
		↓  ↑   ↓			↓   ↑   ↓
		3      9			3  5   11
	row=3					↓ ↑     ↓
					row=4	4      12
</code></pre></h3>
	- 两种方法：
		1. 用一个String[]存储每一行，最后将所有的String拼接就得到所求
		2. 找数学规律			
			- 首尾只有两个数，相隔row*2-2
			- 非首尾三个数，中间的相隔row*2-2-i*2+j
	- 第一种比较容易想到，且效率高
</pre></code>

5 . Reverse-Integer
<pre><code>
	要点：	
		- 注意int溢出时的处理方法，可用long来暂时代替，与Integer.MAX_VALUE或Integer.MIN_VALUE比较
</code></pre>
