package com.qili

import org.apache.zookeeper.{WatchedEvent, Watcher, ZooKeeper}

/**
 * Created by qili on 3/28/15.
 */
class MyWatcher extends Watcher {
  override def process(event: WatchedEvent): Unit = {
    println("in MyWatcher")
  }
}
object ZooKeeperClient {
  def main(args: Array[String]) = {
    val zkClient = new ZooKeeper("192.168.1.102:2181", 15000, new MyWatcher)
    println("come on")
  }
}
