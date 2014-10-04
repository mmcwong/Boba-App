//
//  BACurrentRunViewController.m
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BACurrentRunViewController.h"
#import "Helpers.h"

@class BARunDetailViewController;

NSString *const kCurrentRunTableViewCellId = @"currentRunTableViewCell";

@implementation BACurrentRunViewController

- (void)viewDidLoad {
    self.currentRunTableView.delegate = self;
    self.currentRunTableView.dataSource = self;
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
    UITableViewCell *cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:kCurrentRunTableViewCellId];
    cell.textLabel.text = @"FUCK";
    
    return cell;
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    return 1;
}

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
    UIStoryboard *storyboard = [Helpers getMainStoryboard];
    BARunDetailViewController *runDetailViewController = [storyboard instantiateViewControllerWithIdentifier:@"BARunDetailViewController"];
    [self.navigationController pushViewController:(UIViewController *)runDetailViewController animated:YES];
}

@end
