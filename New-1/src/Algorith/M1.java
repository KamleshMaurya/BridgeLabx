package Algorith;

public class M1 
{
	static class Node
	{
		Node next, prev;
		int data;
	}
	static class LinkedList
	{
		static Node first, last;
		void add(int i)
		{
			Node node = new Node();
			node.data = i;
			if(first == null)
			{
				first = node;
			}
			else
			{
				last.next = node;
			}
			node.prev = last;
			last = node;
		}
		void add(int i,int position)
		{
			Node node = new Node();
			node.data = i;  
			if(first == null)
			{
				first = node;
			}
			else
			{
				Node current =  first;
				int count=0; 
				while(current.next != null)
				{
					count = count+1;
					current = current.next;
					if(count == (position-1))
					{
						Node temp2 = current;
						node.next = current.next;
						node.prev = temp2;
						break;
					}
				}
			}
		}
		static boolean remove(int element)
		{
			boolean status = false;
			if(first.data == element)
			{
				status = true;
				first = first.next;
				return status;
			}
			if(last.data == element)
			{
				Node current = first;
				while(current.next != last)
				{
					current = current.next;
				}
				status = true;
				last = current;
				current.next = null;
				return status;
			}
			Node current = first, prev =last;
			while(current.next != null)
			{
				if(current.data == element)
				{
					status = true;
					prev.next = current.next;
					break;
				}
				prev = current;
				current = current.next;
				
			}
			return status;
		}
		void read()
		{
			Node current = first;
			while(current != null)
			{
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(300);
		list.add(200);
		list.add(80);
		list.add(90);
		list.add(900);
		list.add(700);
		list.add(10);
		list.read();
		list.add(1000, 3);
		System.out.println("-----------");
//		System.out.println(list.remove(300));
//		System.out.println(list.remove(10));
//		System.out.println(list.remove(90));
		list.read();
	}

}
