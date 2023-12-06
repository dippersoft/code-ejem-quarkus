pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
            #/home/miguel/.jdks/openjdk-21.0.1/bin/java '-Dmaven.multiModuleProjectDirectory=/home/miguel/Documentos/QuarkusEjem/code-ejem-quarkus -Djansi.passthrough=true -Dmaven.home=/home/miguel/.m2/wrapper/dists/apache-maven-3.9.5-bin/2adeog8mj13csp1uusqnc1f2mo/apache-maven-3.9.5 -Dclassworlds.conf=/home/miguel/.m2/wrapper/dists/apache-maven-3.9.5-bin/2adeog8mj13csp1uusqnc1f2mo/apache-maven-3.9.5/bin/m2.conf -Dmaven.ext.class.path=/app/IDEA-C/plugins/maven/lib/maven-event-listener.jar -javaagent:/app/IDEA-C/lib/idea_rt.jar=46839:/app/IDEA-C/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/miguel/.m2/wrapper/dists/apache-maven-3.9.5-bin/2adeog8mj13csp1uusqnc1f2mo/apache-maven-3.9.5/boot/plexus-classworlds-2.7.0.jar:/home/miguel/.m2/wrapper/dists/apache-maven-3.9.5-bin/2adeog8mj13csp1uusqnc1f2mo/apache-maven-3.9.5/boot/plexus-classworlds.license org.codehaus.classworlds.Launcher -Didea.version=2023.2.5 package -Dquarkus.package.type=uber-jar'
            echo 'Testing..'
            }
        }
        stage('Test'){
             steps {
                            echo 'Testing..'
                    }
        }
        stage('Deploy') {
             steps {
                            echo 'Deploying....?'
                   }
        }
    }
}

