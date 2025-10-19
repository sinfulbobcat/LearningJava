public class linkedlist {
	protected Node start;
	public linkedlist()
	{
		start = null;
	}
	public boolean isEmpty()
	{
		return start==null;
	}
	public void Insert(int val)
	{
		Node nptr, ptr, save = null;
		nptr = new Node(val, null);
		boolean ins = false;
		if(start == null)
			start = nptr;
		else if(val <= start.getdata())
		{
			nptr.setlink(start);
			start = nptr;
		}
		else
		{
			save = start;
			ptr = start.getlink();
			while(ptr != null)
			{
				if(val >= save.getdata() && val <= ptr.getdata()){
					save.setlink(nptr);
					nptr.setlink(ptr);
					ins = true;
					break;
				}
				else
				{
					save = ptr;
					ptr = ptr.getlink();
				}

			}
			if (ins == false)
			{
				save.setlink(nptr);
			}
		}
	}

	public void display()
	{
		Node ptr = start;
		System.out.print(start.getdata()+"-->");
		ptr = start.getlink();
		while(ptr.getlink() != null)
		{
			System.out.print(ptr.getdata()+"-->");
			ptr = ptr.getlink();
		}
		System.out.print(ptr.getdata() + "!!!!");
		System.out.println();
	}
}
