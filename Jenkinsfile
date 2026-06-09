pipeline
{
  agent any
  stages
  {
    stage("Build")
    {
      steps
      {
        echo "Building Application"
      }
    }
    stage("Test")
    {
     steps
      {
        echo "Test Application"
      }
    }
    stage("Deploy")
    {
      steps
      {
        echo "Deploy Application"
      }
    }
  }
  post
  {
   always
    {
     emailext body: 'summary', subject: 'Git pipeline check', to: 'b9493243818@gmail.com'
    }
  }
}
