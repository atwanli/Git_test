# Git_test
多人协作练习
模拟测试流程

1、master分支添加master.xml,内容为master，
添加到暂存区，在进行撤销到工作区
git status
git add .
git reset --mixed || git rm --cached filename
在添加到版本库中，在进行撤销到暂存区，再撤销到工作区
git commit -m ''
git reset --soft 回退到某个版本
最后提交到远程仓库

2、基于master分支创建develop分支，
添加develop.xml,内容为develop，
提交到远程仓库

3、基于develop分支创建feature-1.1.0 分支，
添加feature-1.1.0.xml,内容为feature-1.1.0，
提交到远程仓库

4、合并feature-1.1.0分支到develop分支
先采用git merge 继续合并查看结果，再将合并进行取消
再采用git merge --no-ff 合并，查看结果，再将合并进行取消，

5、基于develop分支创建测试release-1.1.0分支进行提测
测试后需要修改feature-1.1.0.xml,添加内容为release-1.1.0
测试完成后，推送远程仓库

6、将release-1.1.0分支推送到master和develop分支，并再master分支添加投产标签1.1.0添加备注

7、基于master分支创建bug修改分支，分支为hotfix-1.1.1
修改master.xml,添加hotfix-1.1.1

8、将hotfix-1.1.1分支推送到master和develop分支，并再master分支添加投产标签1.1.1添加备注
