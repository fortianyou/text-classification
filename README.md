# text-classification
A text classification project that applied topics distribution to represent documents.
###项目结构
- `cn.ac.ict.textcalss.algorithm`: 算法类
    - `TopKSelector`: 使用堆排序实现对TopK选择器，复杂度O(nlogk)。
- `cn.ac.ict.textcalss.classifier`: 分类器
    - `KNN`: 实现了KNN算法
    - `Rocchio`: Rocchio算法是一种寻找最近类别中心作为类别的算法。
- `cn.ac.ict.textcalss.cluster`: 聚类算法
    - `Kmeans`: 内容相关，如保存网页正文，分类等等
- `cn.ac.ict.textcalss.sim`: 相似度计算
    - `Similarity`：相似度计算接口，要求所有实现该接口的类都实现getSimilarity方法。
    - `CosineSimilarity`: Cosine 相似度
    - `KullbackLeiblerSimilarity`: 使用KL散度来度量相似度，散度越小相似度越高。
    - `JensenShanonSimilarity`: 使用JS散度来度量相似度，散度越小相似度越高。 
- `cn.ac.ict.textcalss.test`: 测试类
	- `Test`: 内有kmeans, knn, Rocchio 等算法的测试程序
