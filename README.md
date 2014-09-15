MapReduce Basic
==================

Driver Class의 실행

hadoop fs -mkdir -p /output/result

hadoop jar ~/test.jar skill.coach.TestDriver -D inputPath=/upload/acc/Accidents0513.csv -D outputPath=/output/result01/
