根据深入理解java虚拟机一书中的抄写，加深理解
java运行的数据区域：
1、程序计数器：它是一块很小的内存空间，可以把它看作是当前线程所执行的字节码的行号指示器。字节码解释器就是通过计数器的值来选取下一条需要执行的字节码指令，
分支、循环、跳转、异常处理、线程恢复等基础功能都需要依赖这个1计数器来完成。
注意;每个线程都有一个独立的程序计数器，各条线程1之间计数器之间互不影响，独立存储，我们称之为”线程私有“的内存。

1.2、java虚拟机栈：
他与程序计数器一样也是线程私有的，他的生命周期与线程相同，虚拟机栈描述的是java方法执行的内存模型：每个方法再执行的同时会创建一个栈桢来存储
局部变量表、操作数栈、动态链接、方法出口等信息。每个方法从调用到直至执行完成的过程，就对应着一个栈桢在虚拟机栈中入栈到出栈的过程。

经常有人将内存区分为堆内存和栈内存，这种分法比较粗糙,java内存区域的划分远比这复杂。栈内存就是指我们的Java虚拟机栈。其中局部变量表存放着编译期可知的
各种基本数据类型（boolean、byte、char、short、int、float、long、double、对象引用（reference类型，它不等同于对象本身，可能是指向对象起始地址的引用
指针，也可能是指向一个代表对象的句柄或其他与此对象相关的位置）和returnAddress类型（指向一条字节码指令的地址)。
    其中64位长度的long和double类型的数据会占用2个局部变量空间，其余的数据类型只占用1个，局部变量表所需内存空间1在编译期间完成分配，当进入一个方法时
这个方法需要在桢中分配多大的局部变量空间是完全确定的，在方法运行期间不会改变局部1变量表的大小。
    在虚拟机栈规定两种异常：如何线程请求的栈深度大于虚拟机所允许的深度，将抛出StackOverflowError异常:如果虚拟机栈可以动态扩展（当前大部分的java虚拟
 机都可动态扩展1，只不过java虚拟机栈规范中也允许固定长度的虚拟机栈），如果扩展无法申请到足够的内存，就会抛出OutOfMemoryError异常。
 
 1.3、java堆
    java堆是java虚拟机所管理的内存中最大的一块。java堆是被所有线程共享的1一块内存区域，几乎所有的对象实例都在这里分配内存。所有的对象
实例以及数组都要在堆上分配。