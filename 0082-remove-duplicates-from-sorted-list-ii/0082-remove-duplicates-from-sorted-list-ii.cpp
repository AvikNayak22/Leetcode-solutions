/**
 *Definition for singly-linked list.
 *struct ListNode {
 *    int val;
 *    ListNode * next;
 *    ListNode() : val(0), next(nullptr) {}
 *    ListNode(int x) : val(x), next(nullptr) {}
 *    ListNode(int x, ListNode *next) : val(x), next(next) {}
 *};
 */
class Solution
{
    public:
        ListNode* deleteDuplicates(ListNode *head)
        {
            if (head == NULL || head->next == NULL)
                return head;
            ListNode dummy(0);
            dummy.next = head;
            ListNode *prev = &dummy;
            ListNode *current = head;
            prev->next = current;
            while (current)
            {
                while (current->next && current->val == current->next->val)
                {
                    current = current->next;
                }
                if (prev->next != current)
                {
                    prev->next = current->next;
                    delete current;
                    current = prev->next;
                }
                else
                {
                    prev = prev->next;
                    current = current->next;
                }
            }
            return dummy.next;
        }
};