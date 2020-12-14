# dspn

# create a new repository on the command line
echo "# dspn" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/gf420116/dspn.git
git push -u origin main

# 1.Fork/Join 
第一步拆分　第二步分开运算　第三步合并

# 2.parallelStream()生成并行流后，对集合元素的遍历是无序的

# 3.Arrays.asList() 方法接受的是泛型参数，因此不能用于基本类型，
# 如果上送的是
int[] a = {1, 2, 3, 4, 5};
List temp = Arrays.asList(a);
System.out.println("temp size:" + temp.size()); //temp size:1
for (int i = 0; i < temp.size(); i++) {
    System.out.println(temp.get(i)); //[I@74a14482
}
