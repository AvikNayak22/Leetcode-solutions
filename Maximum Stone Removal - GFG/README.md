# Maximum Stone Removal
## Medium
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">There are&nbsp;<strong style="user-select: auto;">n</strong>&nbsp;stones at some integer coordinate points on a 2D plane. Each coordinate point may have at most one stone.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You need to remove some stones.&nbsp;</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">A stone can be removed if it shares either&nbsp;the same row or the same column&nbsp;as another stone that has not been removed.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given an array&nbsp;stones&nbsp;of length&nbsp;<strong style="user-select: auto;">n</strong>&nbsp;where&nbsp;<strong style="user-select: auto;">stones[i] = [xi, yi]</strong>&nbsp;represents the location of the<strong style="user-select: auto;">&nbsp;ith</strong>&nbsp;stone, return&nbsp;the <strong style="user-select: auto;">maximum</strong> possible number of stones that you can remove.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<div style="background: rgb(238, 238, 238); border: 1px solid rgb(204, 204, 204); padding: 5px 10px; user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong><br style="user-select: auto;">
n=6<br style="user-select: auto;">
[[0 0] ,[ 0 1], [1 0] ,[1 2] ,[2 1] ,[2 2]]<br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;">Output:</strong><br style="user-select: auto;">
5<br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;">Example:</strong><br style="user-select: auto;">
One way to remove 5 stones are<br style="user-select: auto;">
1--[0,0]<br style="user-select: auto;">
2--[1,0]<br style="user-select: auto;">
3--[0,1]<br style="user-select: auto;">
4--[2,1]<br style="user-select: auto;">
5--[1,2]</span></div>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong></span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">You don't need to print or input anything. Complete the function <strong style="user-select: auto;">maxRemove()&nbsp;</strong>which takes an integer array&nbsp;arr, an integer&nbsp;n&nbsp;as the input parameters and returns an integer, denoting the maximum number of stones that can be removed.</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:&nbsp;</strong>O(N+K)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Space Complexity:&nbsp;</strong>O(K)</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">1 &lt;= n &lt;=1000<br style="user-select: auto;">
0 &lt;= x[i], y[i]&lt;= 10<sup style="user-select: auto;">4</sup><br style="user-select: auto;">
No two stones are at same position.</span></p>
</div>