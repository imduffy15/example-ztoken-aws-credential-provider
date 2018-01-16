import com.amazonaws.auth.ZtokenAWSCredentialProvider
import com.amazonaws.services.s3.AmazonS3ClientBuilder

object Main extends App {
  val provider = new ZtokenAWSCredentialProvider.Builder("11111111111", "PowerUser").build()
  val client = AmazonS3ClientBuilder.standard().withCredentials(provider).build()
  println(client.listBuckets())
}
