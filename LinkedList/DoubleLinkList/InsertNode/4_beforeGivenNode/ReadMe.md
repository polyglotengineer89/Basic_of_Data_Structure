Check if the next_node is NULL or not. If it’s NULL, return from the function because any new node can not be added before a NULL
Allocate memory for the new node, let it be called new_node
Set new_node->data = new_data
Set the previous pointer of this new_node as the previous node of the next_node, new_node->prev = next_node->prev
Set the previous pointer of the next_node as the new_node, next_node->prev = new_node
Set the next pointer of this new_node as the next_node, new_node->next = next_node;
If the previous node of the new_node is not NULL, then set the next pointer of this previous node as new_node, new_node->prev->next = new_node
Else, if the prev of new_node is NULL, it will be the new head node. So, make (\*head_ref) = new_node.
