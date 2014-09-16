MapReduce Lecture
==================

- HDFS 계정 전환

>su - hdfs

<br>

- Output 디렉토리 생성

>hadoop fs -mkdir -p /output

<br>

- Output 디렉토리 비우기

>hadoop fs -rm -r /output/*

<br>

- 파일 덮어쓰기

>hadoop fs -copyFromLocal -f /upload

<br>

- 파일 내용보기

>hadoop fs -cat /output/result01/part-r-00001

<br>

- Driver Class의 실행

>hadoop jar ~/test01.jar skill.coach.TestDriver -D inputPath=/upload/acc/Accidents0513.csv -D outputPath=/output/result01 -D numReduceTasks=3
